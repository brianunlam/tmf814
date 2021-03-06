package flowDomain;


/**
* flowDomain/ConnectivityState_THelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomain.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p> This attribute provides an indication to the NMS about the server layer
   * connectivity between the MFDs associated to an FD. It shall have one of the 
   * following values: <br>
   * CS_UNKNOWN: The connectivity state of the FD is not known by the EMS<br>
   * CS_FULLY_CONNECTED: all FD Edge CPTPs are reachable to each other<br>
   * CS_NOT_FULLY_CONNECTED: At least one FD Edge CPTP is not reachable by
   * another FD Edge CPTP 
   * </p>
   **/
abstract public class ConnectivityState_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/flowDomain/ConnectivityState_T:1.0";

  public static void insert (org.omg.CORBA.Any a, flowDomain.ConnectivityState_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static flowDomain.ConnectivityState_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (flowDomain.ConnectivityState_THelper.id (), "ConnectivityState_T", new String[] { "CS_UNKNOWN", "CS_FULLY_CONNECTED", "CS_NOT_FULLY_CONNECTED"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static flowDomain.ConnectivityState_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return flowDomain.ConnectivityState_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, flowDomain.ConnectivityState_T value)
  {
    ostream.write_long (value.value ());
  }

}
