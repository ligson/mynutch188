package mynutch188;

import java.io.File;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocalFileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RawLocalFileSystem;
import org.apache.nutch.crawl.CrawlDatum;

public class Test {
	public static void main(String[] args) throws Exception{
		File file = new File("file:///tmp");
		System.out.println(file.getAbsolutePath());
	}
}
