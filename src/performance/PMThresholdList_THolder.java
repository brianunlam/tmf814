package performance;


/**
* performance/PMThresholdList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from performance.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/


/**
   * <p>Sequence of Performance Monitoring Thresholds.</p> 
   **/
public final class PMThresholdList_THolder implements org.omg.CORBA.portable.Streamable
{
  public performance.PMThreshold_T value[] = null;

  public PMThresholdList_THolder ()
  {
  }

  public PMThresholdList_THolder (performance.PMThreshold_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = performance.PMThresholdList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    performance.PMThresholdList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return performance.PMThresholdList_THelper.type ();
  }

}