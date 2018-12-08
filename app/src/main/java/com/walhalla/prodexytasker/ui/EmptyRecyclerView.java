package com.walhalla.prodexytasker.ui;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.walhalla.prodexytasker.R;

public class EmptyRecyclerView extends RecyclerView {

    private View mEmptyView;

    public EmptyRecyclerView(Context context) {
        super(context);
    }

    public EmptyRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public EmptyRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    private void initEmptyView() {
        if (mEmptyView != null) {
            mEmptyView.setVisibility(
                    getAdapter() == null || getAdapter().getItemCount() == 0
                            ? VISIBLE : GONE);
            EmptyRecyclerView.this.setVisibility(
                    getAdapter() == null || getAdapter().getItemCount() == 0
                            ? GONE : VISIBLE);
        }
    }

    final AdapterDataObserver observer = new AdapterDataObserver() {
        @Override
        public void onChanged() {
            super.onChanged();
            initEmptyView();
        }

        @Override
        public void onItemRangeInserted(int positionStart, int itemCount) {
            super.onItemRangeInserted(positionStart, itemCount);
            initEmptyView();
        }

        @Override
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            super.onItemRangeRemoved(positionStart, itemCount);
            initEmptyView();
        }
    };

    @Override
    public void setAdapter(Adapter adapter) {
        Adapter oldAdapter = getAdapter();
        super.setAdapter(adapter);
        if (oldAdapter != null) {
            oldAdapter.unregisterAdapterDataObserver(observer);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(observer);
        }
    }


    public void setEmptyView(@LayoutRes int layout, @StringRes int string) {
        this.mEmptyView = LayoutInflater.from(getContext())
                .inflate(R.layout.item_empty_data, this, false);
        if (mEmptyView instanceof TextView) {
            ((TextView) mEmptyView).setText(string);
        }
        initEmptyView();
    }
}
