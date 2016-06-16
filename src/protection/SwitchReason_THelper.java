package protection;


/**
* protection/SwitchReason_THelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from protection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>The switch reason reflects the reason why a
   * switch occurred.<br>
   * SR_NA is used upon retrieval of switch data for non-revertive groups, if a 
   * more precise value is not available.<br>
   * SR_RESTORED is used for revertive groups to indicate a return to the normal 
   * state.<br>
   * SR_SIGNAL_MISMATCH is used in the case the signal is ok, but is identified 
   * as coming from an incorrect source: TRAIL_TRACE_IDENTIFIER_MISMATCH, Signal 
   * Label Mismatch, etc.<br>
   * SR_AUTOMATIC_SWITCH is used when the exact switch reason is unknown,
   *  in retrievals of switch data if a protection switch is currently active
   *  or in protection switch notifications.<br>
   * SR_MANUAL indicates a switch that was requested by the operator
   * and includes forced switches.
   * </p>
   **/
abstract public class SwitchReason_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/protection/SwitchReason_T:1.0";

  public static void insert (org.omg.CORBA.Any a, protection.SwitchReason_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static protection.SwitchReason_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (protection.SwitchReason_THelper.id (), "SwitchReason_T", new String[] { "SR_NA", "SR_RESTORED", "SR_SIGNAL_FAIL", "SR_SIGNAL_MISMATCH", "SR_SIGNAL_DEGRADE", "SR_AUTOMATIC_SWITCH", "SR_MANUAL"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static protection.SwitchReason_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return protection.SwitchReason_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, protection.SwitchReason_T value)
  {
    ostream.write_long (value.value ());
  }

}