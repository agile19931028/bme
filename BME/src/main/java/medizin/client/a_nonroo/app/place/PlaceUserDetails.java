package medizin.client.a_nonroo.app.place;


import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.RequestFactory;

public class PlaceUserDetails extends Place {

	public enum Operation {
		DETAILS, CREATE, EDIT
	}
	private static final String SEPARATOR = "!";
	private String placeName;

	private EntityProxyId<?> proxyId;
	private Operation operation = null;
	
	
	public EntityProxyId<?> getProxyId() {
		return proxyId;
	}
	public void setProxyId(EntityProxyId<?> id) {
		this.proxyId = id;
	}
	    public PlaceUserDetails(String placeName) {
	        this.placeName = placeName;
	    }
	    
		public PlaceUserDetails(EntityProxyId<?> record) {
			this(record, Operation.DETAILS);
			
		}

		public PlaceUserDetails(Operation operation) {
	    	Log.debug("PlaceUserDetails wird erstellt");
			this.operation = operation;

		}

	    public PlaceUserDetails(EntityProxyId<?> stableId, Operation operation) {
	    	Log.debug("PlaceUserDetails wird erstellt");
			this.operation = operation;
			proxyId = stableId;
			assert(operation!=operation.CREATE);
		}

		public String getPlaceName() {
	        return placeName;
	    }
		public Operation getOperation() {
			Log.debug("PlaceUserDetails.getOperation: " + operation);
			return operation;
		}


	    public static class Tokenizer implements PlaceTokenizer<PlaceUserDetails> {
	    	

	        private McAppRequestFactory requestFactory;

			public Tokenizer(McAppRequestFactory requestFactory) {
	        	this.requestFactory = requestFactory;
			}

			@Override
	        public String getToken(PlaceUserDetails place) {
	        	Log.debug("Im PlaceInstitution.getToken: Placename -" + place.getProxyId());
	        	
//	        	if (requests==null)
//	        	Log.warn("requests null");
	        	
				if (Operation.DETAILS == place.getOperation()) {
					return place.getProxyId() + SEPARATOR + PlaceUserDetails.Operation.DETAILS;
				}
				else if (Operation.CREATE == place.getOperation()) {
					return /*place.getProxyId() + SEPARATOR + */PlaceUserDetails.Operation.CREATE.toString();
				}
				else if (Operation.EDIT == place.getOperation()) {
					return place.getProxyId() + SEPARATOR + PlaceUserDetails.Operation.EDIT;
				}

	        	
	            return place.getPlaceName();
	        }

	        @Override
	        public PlaceUserDetails getPlace(String token) {
	        	Log.debug("Im PlaceInstitutionEvent.getPlace: Token -" + token);
	        	
				String bits[] = token.split(SEPARATOR);
				Operation operation = Operation.valueOf(bits[1]);
				if (Operation.DETAILS == operation) {
					return new PlaceUserDetails(requestFactory.getProxyId(bits[0]), Operation.DETAILS);
				}
				if (Operation.EDIT == operation) {
					return new PlaceUserDetails(requestFactory.getProxyId(bits[0]), Operation.EDIT);
				}
				if (Operation.CREATE == operation) {
					return new PlaceUserDetails(/*requestFactory.getProxyId(bits[0]), */Operation.CREATE);
				}

				
	            return new PlaceUserDetails(token);
	            
	            
	        }
	    }
	    
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj) {
//				return true;
//			}
//			if (obj == null) {
//				return false;
//			}
//			if (getClass() != obj.getClass()) {
//				return false;
//			}
//			//wenn ProxyId nicht gesetzt war es eine Löschaktion
//			if (this.proxyId==null){
//				return false;
//			}
//			PlaceUserDetails other = (PlaceUserDetails) obj;
//			//wenn O
//			if (this.getOperation()!=other.getOperation()){
//				return false;
//			}
////			ProxyListPlace other = (ProxyListPlace) obj;
////			if (!proxyType.equals(other.proxyType)) {
////				return false;
////			}
//			return true;
//		}

}
