package medizin.client.a_nonroo.app.activities;


import medizin.client.a_nonroo.app.place.PlaceAcceptAnswer;
import medizin.client.a_nonroo.app.place.PlaceAcceptAssQuestion;
import medizin.client.a_nonroo.app.place.PlaceAcceptPerson;
import medizin.client.a_nonroo.app.place.PlaceAcceptQuestion;
import medizin.client.a_nonroo.app.place.PlaceAsignAssQuestion;
import medizin.client.a_nonroo.app.place.PlaceAssesment;
import medizin.client.a_nonroo.app.place.PlaceAssesmentDetails;
import medizin.client.a_nonroo.app.place.PlaceBookAssesment;
import medizin.client.a_nonroo.app.place.PlaceInstitution;
import medizin.client.a_nonroo.app.place.PlaceInstitutionEvent;
import medizin.client.a_nonroo.app.place.PlaceOpenDemand;
import medizin.client.a_nonroo.app.place.PlaceQuestion;
import medizin.client.a_nonroo.app.place.PlaceQuestionDetails;
import medizin.client.a_nonroo.app.place.PlaceQuestiontypes;
import medizin.client.a_nonroo.app.place.PlaceStaticContent;
import medizin.client.a_nonroo.app.place.PlaceSystemOverview;
import medizin.client.a_nonroo.app.place.PlaceUser;
import medizin.client.a_nonroo.app.place.PlaceUserDetails;
import medizin.client.a_nonroo.app.request.McAppRequestFactory;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
/**
 * Maps assesment details places with activities.
 * @author masterthesis
 *
 */
public class ActivityAssesmentMapper implements ActivityMapper {



	private McAppRequestFactory requests;
	private PlaceController placeController;

	@Inject
	public ActivityAssesmentMapper(McAppRequestFactory requests,
			PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
	}

	@Override
	public Activity getActivity(Place place) {
		Log.debug("im ActivityAssesmentMapper.getActivity");
		 if (place instanceof PlaceAssesmentDetails){
			 PlaceAssesmentDetails myPlace = (PlaceAssesmentDetails) place;
			 if(myPlace.getOperation() == PlaceAssesmentDetails.Operation.DETAILS){
				 return new ActivityAssesmentDetails((PlaceAssesmentDetails) place, requests, placeController);
			 }
				
			 else if (myPlace.getOperation() == PlaceAssesmentDetails.Operation.CREATE){
				 return new ActivityAssesmentCreate((PlaceAssesmentDetails) place,  requests, placeController);
				 }
			 
			 else if (myPlace.getOperation() == PlaceAssesmentDetails.Operation.EDIT){
				 return new ActivityAssesmentCreate((PlaceAssesmentDetails) place,  requests, placeController, PlaceAssesmentDetails.Operation.EDIT);
				 }
		 

		 }
	            

		 Log.debug("im ActivityUserMapper.getActivity, null returned");

		return null;
	}

}
