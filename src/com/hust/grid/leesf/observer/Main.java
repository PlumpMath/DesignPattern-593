package com.hust.grid.leesf.observer;

/**
 * @since 2016/6/1
 * @author LEESF
 *
 */
public class Main {
	public static void main(String[] args) {
		// 新生主题
		CNBlog cnBlog = new CNBlog();
		CSDN csdn = new CSDN();
		TouTiao touTiao = new TouTiao();
		
		// 新生程序员
		Observer leesf = new Coder("leesf");
		// 向CNBlog主题注册
		cnBlog.registerObserver(leesf);
		// 向CSDN主题注册
		csdn.registerObserver(leesf);
		
		// 新生设计师
		Observer dyd = new Coder("dyd");
		// 向CSDN主题注册
		csdn.registerObserver(dyd);
		// 向头条主题注册
		touTiao.registerObserver(dyd);
		
		// 新生科学家
		Observer ld = new Scientist("ld");
		// 向头条主题注册
		touTiao.registerObserver(ld);
		
		// 模拟主题发生变化
		cnBlog.setMessage("leesf在博客园上发布了一篇新文章");
		System.out.println("----------------------------------------");
		
		// 模拟主题发生变化
		csdn.setMessage("leesf在CSDN上发布了一篇新文章");
		System.out.println("----------------------------------------");
		
		// 模拟主题发生变化
		touTiao.setMessage("头条更新了新闻");
	}
}
