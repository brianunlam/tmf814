package CosNaming;

/**
* CosNaming/BindingHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNaming.idl
* Wednesday, June 15, 2016 7:24:31 PM COT
*/

public final class BindingHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.Binding value = null;

  public BindingHolder ()
  {
  }

  public BindingHolder (CosNaming.Binding initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.BindingHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.BindingHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.BindingHelper.type ();
  }

}
