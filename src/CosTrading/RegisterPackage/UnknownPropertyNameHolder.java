package CosTrading.RegisterPackage;

/**
* CosTrading/RegisterPackage/UnknownPropertyNameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class UnknownPropertyNameHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.RegisterPackage.UnknownPropertyName value = null;

  public UnknownPropertyNameHolder ()
  {
  }

  public UnknownPropertyNameHolder (CosTrading.RegisterPackage.UnknownPropertyName initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.RegisterPackage.UnknownPropertyNameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.RegisterPackage.UnknownPropertyNameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.RegisterPackage.UnknownPropertyNameHelper.type ();
  }

}
