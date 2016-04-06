package com.htech.demo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;
import com.htech.demo.R;
import com.htech.demo.model.Customer;

import java.util.ArrayList;

/**
 * Created by software on 22/2/16.
 */
public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {

    private ArrayList<Customer> mCustomer;
    private Context mContext;
    public CustomerAdapter(Context pContext, ArrayList<Customer> pProduct) {
        mCustomer = pProduct;
        mContext = pContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_customer_list, parent, false);


        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        final Customer product = mCustomer.get(position);

    }

    @Override
    public int getItemCount() {
        return mCustomer.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public SimpleDraweeView mImageView;

        public ViewHolder(View view) {
            super(view);
            mImageView = (SimpleDraweeView) view.findViewById(R.id.rclist_ivPhoto);
        }
    }
}
