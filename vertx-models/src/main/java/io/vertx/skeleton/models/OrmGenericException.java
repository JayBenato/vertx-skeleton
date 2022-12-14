package io.vertx.skeleton.models;

public class OrmGenericException extends VertxServiceException {


  public OrmGenericException(Error error) {
    super(error);
  }


  public static OrmGenericException illegalState() {
    return new OrmGenericException(new Error("Illegal state", "", 500));
  }


  public static OrmGenericException notImplemented() {
    return new OrmGenericException(new Error("Not Implemented", "", 500));
  }


  public static OrmGenericException notImplemented(String hint) {
    return new OrmGenericException(new Error("Not Implemented", hint, 500));
  }

  public static <T> OrmGenericException notFound(Class<T> tClass) {
    return new OrmGenericException(new Error(tClass.getSimpleName() + " not found !", "Check query parameters", 400));
  }

  public static <T> OrmGenericException duplicated(Class<T> tClass) {
    return new OrmGenericException(new Error("Duplicated record " + tClass.getSimpleName(), null, 400));
  }
}
