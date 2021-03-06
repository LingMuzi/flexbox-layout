/*
 * Copyright 2016 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.flexbox.recyclerview;

import com.google.android.apps.flexbox.R;

import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

/**
 * ViewHolder implementation for a flex item.
 */
class FlexItemViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;

    FlexItemViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.textview);
    }

    void bindTo(RecyclerView.LayoutParams layoutParams) {
        int adapterPosition = getAdapterPosition();
        mTextView.setText(String.valueOf(adapterPosition + 1));
        mTextView.setBackgroundResource(R.drawable.flex_item_background);
        mTextView.setGravity(Gravity.CENTER);
        mTextView.setLayoutParams(layoutParams);
    }
}
