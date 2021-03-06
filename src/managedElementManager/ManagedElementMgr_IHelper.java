package managedElementManager;


/**
* managedElementManager/ManagedElementMgr_IHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from managedElementManager.idl
* Wednesday, June 15, 2016 7:24:38 PM COT
*/


/**
   * <p>The managedElementManager is used to gain access to operations
   * which deal with managed elements and termination points.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSessionFactory::EmsSession_I::getManager() operation in Manager.</p>
   **/
abstract public class ManagedElementMgr_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I:1.0";

  public static void insert (org.omg.CORBA.Any a, managedElementManager.ManagedElementMgr_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static managedElementManager.ManagedElementMgr_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (managedElementManager.ManagedElementMgr_IHelper.id (), "ManagedElementMgr_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static managedElementManager.ManagedElementMgr_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ManagedElementMgr_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, managedElementManager.ManagedElementMgr_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static managedElementManager.ManagedElementMgr_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof managedElementManager.ManagedElementMgr_I)
      return (managedElementManager.ManagedElementMgr_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      managedElementManager._ManagedElementMgr_IStub stub = new managedElementManager._ManagedElementMgr_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static managedElementManager.ManagedElementMgr_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof managedElementManager.ManagedElementMgr_I)
      return (managedElementManager.ManagedElementMgr_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      managedElementManager._ManagedElementMgr_IStub stub = new managedElementManager._ManagedElementMgr_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
