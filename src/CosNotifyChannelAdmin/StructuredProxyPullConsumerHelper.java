package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/StructuredProxyPullConsumerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for structured proxy pull consumers.
    */
abstract public class StructuredProxyPullConsumerHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyChannelAdmin/StructuredProxyPullConsumer:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyChannelAdmin.StructuredProxyPullConsumer that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyChannelAdmin.StructuredProxyPullConsumer extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyChannelAdmin.StructuredProxyPullConsumerHelper.id (), "StructuredProxyPullConsumer");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyChannelAdmin.StructuredProxyPullConsumer read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_StructuredProxyPullConsumerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyChannelAdmin.StructuredProxyPullConsumer value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyChannelAdmin.StructuredProxyPullConsumer narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyChannelAdmin.StructuredProxyPullConsumer)
      return (CosNotifyChannelAdmin.StructuredProxyPullConsumer)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyChannelAdmin._StructuredProxyPullConsumerStub stub = new CosNotifyChannelAdmin._StructuredProxyPullConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyChannelAdmin.StructuredProxyPullConsumer unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyChannelAdmin.StructuredProxyPullConsumer)
      return (CosNotifyChannelAdmin.StructuredProxyPullConsumer)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyChannelAdmin._StructuredProxyPullConsumerStub stub = new CosNotifyChannelAdmin._StructuredProxyPullConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}