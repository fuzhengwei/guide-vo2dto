package cn.itedus.demo.interfaces.assembler;


/**
 * @description: 对象装配器接口
 * @author: 小傅哥，微信：fustack
 * @date: 2021/9/14
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IAssembler<SOURCE, TARGET> {

    TARGET sourceToTarget(SOURCE var);

}
