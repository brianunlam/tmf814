package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/ConsumerAdminHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosEventChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:31 PM COT
*/


/**
    * Interface for the consumer administration object.
    */
public final class ConsumerAdminHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventChannelAdmin.ConsumerAdmin value = null;

  public ConsumerAdminHolder ()
  {
  }

  public ConsumerAdminHolder (CosEventChannelAdmin.ConsumerAdmin initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventChannelAdmin.ConsumerAdminHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventChannelAdmin.ConsumerAdminHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventChannelAdmin.ConsumerAdminHelper.type ();
  }

}
