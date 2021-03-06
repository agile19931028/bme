package com.google.gwt.user.client.rpc.core.java.lang;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class NegativeArraySizeException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, java.lang.NegativeArraySizeException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static java.lang.NegativeArraySizeException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new java.lang.NegativeArraySizeException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, java.lang.NegativeArraySizeException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer.deserialize(reader, (java.lang.NegativeArraySizeException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer.serialize(writer, (java.lang.NegativeArraySizeException)object);
  }
  
}
