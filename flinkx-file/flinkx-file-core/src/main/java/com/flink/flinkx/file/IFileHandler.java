package com.flink.flinkx.file;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * program: flinkx-all->IFileHandler
 * description: 文件操作
 * author: gerry
 * created: 2020-05-22 09:26
 **/
public interface IFileHandler {
    /**
     * 判断给定的目录是否存在
     *
     * @param directoryPath 要检查的路径
     * @return true:存在，false:不存在
     */
    boolean isDirExist(String directoryPath);

    /**
     * 检查给定的文件是否存在
     *
     * @param filePath 要检查的文件路径
     * @return true:存在,false:不存在
     */
    boolean isFileExist(String filePath);

    /**
     * 获取文件输入流
     *
     * @param filePath 文件路径
     * @return 数据流
     */
    InputStream getInputStream(String filePath);

    /**
     * 列出指定路径下的目录
     *
     * @param path 路径
     * @return 目录列表
     */
    List<String> listDirs(String path);

    /**
     * 列出路径下的文件
     *
     * @param path 路径
     * @return 文件列表
     */
    List<String> getFiles(String path);

    /**
     * 递归创建目录
     *
     * @param directoryPath 要创建的目录
     */
    void mkDirRecursive(String directoryPath);

    /**
     * 获取输出数据流
     *
     * @param filePath 文件路径
     * @return 数据流
     */
    OutputStream getOutputStream(String filePath);

    /**
     * 删除目录下的文件
     *
     * @param dir 指定的目录
     * @param exclude 要排除的文件
     */
    void deleteAllFilesInDir(String dir, List<String> exclude);

    /**
     * 重命名路径
     *
     * @param oldPath 原来的路径名称
     * @param newPath 新的路径名称
     * @throws Exception 可能会出现文件不存在，连接异常等
     */
    void rename(String oldPath, String newPath) throws Exception;
}
