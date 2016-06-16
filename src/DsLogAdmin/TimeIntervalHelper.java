package DsLogAdmin;


/**
* DsLogAdmin/TimeIntervalHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

abstract public class TimeIntervalHelper
{
  private static String  _id = "IDL:omg.org/DsLogAdmin/TimeInterval:1.0";

  public static void insert (org.omg.CORBA.Any a, DsLogAdmin.TimeInterval that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DsLogAdmin.TimeInterval extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulonglong);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (TimeBase.TimeTHelper.id (), "TimeT", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (DsLogAdmin.TimeTHelper.id (), "TimeT", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "start",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulonglong);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (TimeBase.TimeTHelper.id (), "TimeT", _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (DsLogAdmin.TimeTHelper.id (), "TimeT", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "stop",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (DsLogAdmin.TimeIntervalHelper.id (), "TimeInterval", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DsLogAdmin.TimeInterval read (org.omg.CORBA.portable.InputStream istream)
  {
    DsLogAdmin.TimeInterval value = new DsLogAdmin.TimeInterval ();
    value.start = istream.read_ulonglong ();
    value.stop = istream.read_ulonglong ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DsLogAdmin.TimeInterval value)
  {
    ostream.write_ulonglong (value.start);
    ostream.write_ulonglong (value.stop);
  }

}