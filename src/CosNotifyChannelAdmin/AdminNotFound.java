package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/AdminNotFound.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/

public final class AdminNotFound extends org.omg.CORBA.UserException
{

  public AdminNotFound ()
  {
    super(AdminNotFoundHelper.id());
  } // ctor


  public AdminNotFound (String $reason)
  {
    super(AdminNotFoundHelper.id() + "  " + $reason);
  } // ctor

} // class AdminNotFound
