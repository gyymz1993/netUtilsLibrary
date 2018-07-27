package com.ryan.corelibs.view.interfaces;

import com.ryan.corelibs.model.entity.Repository;

import java.util.List;

public interface MainView{
    void renderResult(List<Repository> repositories, boolean reload);
}
