package CosTrading;


/**
* CosTrading/UnknownOfferId.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class UnknownOfferId extends org.omg.CORBA.UserException
{
  public String id = null;

  public UnknownOfferId ()
  {
    super(UnknownOfferIdHelper.id());
  } // ctor

  public UnknownOfferId (String _id)
  {
    super(UnknownOfferIdHelper.id());
    id = _id;
  } // ctor


  public UnknownOfferId (String $reason, String _id)
  {
    super(UnknownOfferIdHelper.id() + "  " + $reason);
    id = _id;
  } // ctor

} // class UnknownOfferId
