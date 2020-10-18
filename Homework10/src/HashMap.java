/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class HashMap {
  private final static int TABLE_SIZE = 100000000;
  private int index;
  private String probe;
  
  HashEntry[] table;

  HashMap(String probe) 
  {
      table = new HashEntry[TABLE_SIZE];
      this.probe = probe;
  }
  public void setProbe(String probe)
  {
	  this.probe = probe;
  }
  public String getProbe()
  {
	  return this.probe;
  }
  public String get(double key) 
  {
	  index = (int) (key % TABLE_SIZE);
	  
	  while(true)
	  {
		  if (table[index].getKey() == key)
		  {
			  return table[index].getValue();
		  }
		  else if (table[index] == null)
		  {
			  return null;
		  }
		  else
		  {
			  if (probe == "basic")
			  {
				  index = ((7 * index) + 1) % TABLE_SIZE;
			  }
			  else if (probe == "linear")
			  {
				  index++;
			  }
			  else if (probe == "quadratic")
			  {
				  index *= index;
			  }
		  }
	  }
  }

  public void put(double key, String value) 
  {
       index = (int) (key % TABLE_SIZE);
       if (probe == "basic")
       {
    	   basicProbe(key, value);
       }
       else if (probe == "linear")
       {
    	   linearProbe(key, value);
       }
       else if (probe == "quadratic")
       {
    	   quadraticProbe(key, value);
       }
  }
  public void basicProbe(double key, String value)
  {
	  if (table[index] != null && key != table[index].getKey())
      {
		  while (true)
		  {
			  index = ((7 * index) + 1) % TABLE_SIZE;
			  if (table[index] == null)
			  {
				  table[index] = new HashEntry(key, value);
				  break;
			  }
			  else if (table[index] != null && key == table[index].getKey())
			  {
				  table[index].setValue(value);
				  break;
			  }
		  }
      }
	  else if (table[index] == null)
	  {
		  table[index] = new HashEntry(key, value);
	  }
  }
  public void linearProbe(double key, String value)
  {
	  if (table[index] != null && key != table[index].getKey())
      {
		  while (true)
		  {
			  index++;
			  if (table[index] == null)
			  {
				  table[index] = new HashEntry(key, value);
				  break;
			  }
			  else if (table[index] != null && key == table[index].getKey())
			  {
				  table[index].setValue(value);
				  break;
			  }
		  }
      }
	  else if (table[index] == null)
	  {
		  table[index] = new HashEntry(key, value);
	  }
  }

  public void quadraticProbe(double key, String value){
	  if (table[index] != null && key != table[index].getKey())
      {
		  while (true)
		  {
			  index *= index;
			  if (table[index] == null)
			  {
				  table[index] = new HashEntry(key, value);
				  break;
			  }
			  else if (table[index] != null && key == table[index].getKey())
			  {
				  table[index].setValue(value);
				  break;
			  }
		  }
      }
	  else if (table[index] == null)
	  {
		  table[index] = new HashEntry(key, value);
	  }
  }

}
