package DsLogAdmin;


/**
* DsLogAdmin/LogLocked.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class LogLocked extends org.omg.CORBA.UserException
{

  public LogLocked ()
  {
    super(LogLockedHelper.id());
  } // ctor


  public LogLocked (String $reason)
  {
    super(LogLockedHelper.id() + "  " + $reason);
  } // ctor

} // class LogLocked