package com.mvcoder.dragger2demo.dependency.component;


import com.mvcoder.dragger2demo.dependency.anno.FriendScope;
import com.mvcoder.dragger2demo.dependency.bean.Man;

import dagger.Component;

@FriendScope    //如果 MainComponent 设置了 scope，依赖的Component必须设置 scope，并且不能跟ManComponent相同
@Component(dependencies = {ManComponent.class})
public interface FriendComponent {

    void injectMan(Man man);
}
