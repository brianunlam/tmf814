package DsLogAdmin;


/**
* DsLogAdmin/AnysHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class AnysHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.Any value[] = null;

  public AnysHolder ()
  {
  }

  public AnysHolder (org.omg.CORBA.Any[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.AnysHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.AnysHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.AnysHelper.type ();
  }

}
