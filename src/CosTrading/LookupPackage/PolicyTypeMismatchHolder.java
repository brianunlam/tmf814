package CosTrading.LookupPackage;

/**
* CosTrading/LookupPackage/PolicyTypeMismatchHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class PolicyTypeMismatchHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.LookupPackage.PolicyTypeMismatch value = null;

  public PolicyTypeMismatchHolder ()
  {
  }

  public PolicyTypeMismatchHolder (CosTrading.LookupPackage.PolicyTypeMismatch initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.LookupPackage.PolicyTypeMismatchHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.LookupPackage.PolicyTypeMismatchHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.LookupPackage.PolicyTypeMismatchHelper.type ();
  }

}
