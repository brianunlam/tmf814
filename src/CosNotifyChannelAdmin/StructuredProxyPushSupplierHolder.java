package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/StructuredProxyPushSupplierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for structured proxy push suppliers.
    */
public final class StructuredProxyPushSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.StructuredProxyPushSupplier value = null;

  public StructuredProxyPushSupplierHolder ()
  {
  }

  public StructuredProxyPushSupplierHolder (CosNotifyChannelAdmin.StructuredProxyPushSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.StructuredProxyPushSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.StructuredProxyPushSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.StructuredProxyPushSupplierHelper.type ();
  }

}