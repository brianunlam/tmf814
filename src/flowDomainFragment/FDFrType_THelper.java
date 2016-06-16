package flowDomainFragment;


/**
* flowDomainFragment/FDFrType_THelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomainFragment.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p> The FDFr types of a flow domain fragment
   * or matrix flow domain fragment: <br>
   * "FDFRT_POINT_TO_POINT": the FDFr is between exactly two points <br>
   * "FDFRT_POINT_TO_MULTIPOINT": (E-tree) <br>
   * "FDFRT_MULTIPOINT": the FDFr is between at least two points <br>
   * </p>
   **/
abstract public class FDFrType_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/flowDomainFragment/FDFrType_T:1.0";

  public static void insert (org.omg.CORBA.Any a, String that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static String extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_string_tc (0);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (flowDomainFragment.FDFrType_THelper.id (), "FDFrType_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static String read (org.omg.CORBA.portable.InputStream istream)
  {
    String value = null;
    value = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String value)
  {
    ostream.write_string (value);
  }

}