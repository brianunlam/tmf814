package CosTrading;


/**
* CosTrading/IllegalServiceType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class IllegalServiceType extends org.omg.CORBA.UserException
{
  public String type = null;

  public IllegalServiceType ()
  {
    super(IllegalServiceTypeHelper.id());
  } // ctor

  public IllegalServiceType (String _type)
  {
    super(IllegalServiceTypeHelper.id());
    type = _type;
  } // ctor


  public IllegalServiceType (String $reason, String _type)
  {
    super(IllegalServiceTypeHelper.id() + "  " + $reason);
    type = _type;
  } // ctor

} // class IllegalServiceType