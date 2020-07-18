package pers.amos.spring.resourceLoader;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.*;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

/**
 * @author amos wong
 * @create 2020-07-16 3:03 下午
 */

public class ResourceLoaderTest {

	@Test
	public void testResourceLoader1() throws IOException {
		ResourceLoader resourceLoader = new DefaultResourceLoader();

		Resource fileResource1 = resourceLoader.getResource("D:/Users/amoswong/Desktop/note/2.Redis/1.主从复制.md");
		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));

		Resource fileResource2 = resourceLoader.getResource("/Users/amoswong/Desktop/note/2.Redis/1.主从复制.md");
		System.out.println("fileResource2 is ClassPathResource:" + (fileResource2 instanceof ClassPathResource));

		Resource urlResource1 = resourceLoader.getResource("file:/Users/amoswong/Desktop/note/2.Redis/1.主从复制.md");
		System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));

		Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
		System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof  UrlResource));

		ResourceLoader fileSystemResourceLoader = new FileSystemResourceLoader();
		Resource fileResource3 = fileSystemResourceLoader.getResource("D:/Users/amoswong/Desktop/note/2.Redis/1.主从复制.md");
		System.out.println("fileResource3 is urlResource:" + (fileResource3 instanceof FileSystemResource));

		PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = patternResolver.getResources("classpath*:bean*.xml");
		for (Resource resource : resources) {
			System.out.println(resource.getFilename());
		}
	}

}
