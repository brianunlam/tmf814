package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/ProxyIDSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * A sequence of proxy identifiers.
    */
public final class ProxyIDSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public ProxyIDSeqHolder ()
  {
  }

  public ProxyIDSeqHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.ProxyIDSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.ProxyIDSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.ProxyIDSeqHelper.type ();
  }

}