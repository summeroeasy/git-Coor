package org.example;

public class UserDefineClassLoader extends ClassLoader{

    private String rootPath;

    public UserDefineClassLoader(String rootPath) {
        this.rootPath =  rootPath;
    }

//    @Override
//    protected Class<?> findClass(String name) throws ClassNotFoundException {
//
//        //转换为以文件路径表示的文件
//        String filePath = classToFilePath(name);
//
//        //获取指定路径Class文件对应的二进制数据
//
//
//    }

    private String classToFilePath(String name) {

        return rootPath + "\\" + name.replace(".", "\\") + ".class";
    }

    public static void main(String[] args) { //加载T
        try {
            UserDefineClassLoader loader =
                    new UserDefineClassLoader("D:\\code\\mianshi\\src\\main\\java");
            loader.findClass("org.example.T");



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
