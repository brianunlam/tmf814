package DsLogAdmin;

/**
* DsLogAdmin/LogMgrHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class LogMgrHolder implements org.omg.CORBA.portable.Streamable
{
  public DsLogAdmin.LogMgr value = null;

  public LogMgrHolder ()
  {
  }

  public LogMgrHolder (DsLogAdmin.LogMgr initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.LogMgrHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.LogMgrHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.LogMgrHelper.type ();
  }

}