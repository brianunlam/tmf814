package CosNotification;


/**
* CosNotification/Property.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotification.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/

public final class Property implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public org.omg.CORBA.Any value = null;

  public Property ()
  {
  } // ctor

  public Property (String _name, org.omg.CORBA.Any _value)
  {
    name = _name;
    value = _value;
  } // ctor

} // class Property