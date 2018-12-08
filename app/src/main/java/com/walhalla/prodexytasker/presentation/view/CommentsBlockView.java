package com.walhalla.prodexytasker.presentation.view;
import com.walhalla.beans.CommentsBlockResponse;
import com.walhalla.prodexytasker.presentation.view.base.BaseView;

import java.util.List;

public interface CommentsBlockView extends BaseView {
    void hideLoading();

    void showCommentsBlock(List<CommentsBlockResponse> blockResponse);
}
