package org.ligson.test;

import java.io.File;

import org.apache.nutch.crawl.CrawlDb;

public class CrawlTest {
	public static void main(String[] args) {
		File crawl = new File("./crawl");
		File urls = new File("./urls");
		String[] args2 = new String[] { urls.getAbsolutePath(), "-dir",
				crawl.getAbsolutePath() };
		CrawlDb crawlDb = new CrawlDb();
		try {
			// urls -dir crawl -depth 3 -topN 5
			crawlDb.main(args2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
