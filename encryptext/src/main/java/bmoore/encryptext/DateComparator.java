package bmoore.encryptext;

import java.io.File;
import java.util.Comparator;

class DateComparator implements Comparator<File>
{
  public int compare(File paramFile1, File paramFile2)
  {
    long l1 = paramFile1.lastModified();
    long l2 = paramFile2.lastModified();
    if (l1 > l2)
      return 1;
    if (l1 < l2)
      return -1;
    return 0;
  }
}

/* Location:           C:\Users\Benjamin Moore\Dropbox\App\Code Recovery\classes_dex2jar.jar
 * Qualified Name:     com.encryptext.DateComparator
 * JD-Core Version:    0.6.2
 */