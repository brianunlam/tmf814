package protection;

/**
* protection/ESwitchData_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from protection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/

public final class ESwitchData_THolder implements org.omg.CORBA.portable.Streamable
{
  public protection.ESwitchData_T value = null;

  public ESwitchData_THolder ()
  {
  }

  public ESwitchData_THolder (protection.ESwitchData_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = protection.ESwitchData_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    protection.ESwitchData_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return protection.ESwitchData_THelper.type ();
  }

}
