package flowDomainFragment;

/**
* flowDomainFragment/MatrixFlowDomainFragment_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomainFragment.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/

public final class MatrixFlowDomainFragment_THolder implements org.omg.CORBA.portable.Streamable
{
  public flowDomainFragment.MatrixFlowDomainFragment_T value = null;

  public MatrixFlowDomainFragment_THolder ()
  {
  }

  public MatrixFlowDomainFragment_THolder (flowDomainFragment.MatrixFlowDomainFragment_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = flowDomainFragment.MatrixFlowDomainFragment_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    flowDomainFragment.MatrixFlowDomainFragment_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return flowDomainFragment.MatrixFlowDomainFragment_THelper.type ();
  }

}