package com.cjf.designpattern.decorator;

/**
 * Created by chenjifang on 2017/4/12.
 */

public class DecoratorComponent extends Component {
    private ConcreateComponent mConcreateComponent;

    public DecoratorComponent(ConcreateComponent concreateComponent) {
        mConcreateComponent = concreateComponent;
    }

    @Override
    void execute() {
        mConcreateComponent.execute();
    }
}
