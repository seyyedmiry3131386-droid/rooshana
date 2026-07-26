package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import defpackage.q6;
import defpackage.yn;

/* JADX INFO: loaded from: classes.dex */
public class ListFragment extends d {
    public final Handler A0 = new Handler();
    public final q6 B0 = new q6(21, this);
    public final yn C0 = new yn(1, this);
    public ListView D0;
    public View E0;
    public TextView F0;
    public View G0;
    public View H0;
    public boolean I0;

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextQ0 = q0();
        FrameLayout frameLayout = new FrameLayout(contextQ0);
        LinearLayout linearLayout = new LinearLayout(contextQ0);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextQ0, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextQ0);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextQ0);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextQ0);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.d
    public final void b0() {
        this.A0.removeCallbacks(this.B0);
        this.D0 = null;
        this.I0 = false;
        this.H0 = null;
        this.G0 = null;
        this.E0 = null;
        this.F0 = null;
        this.H = true;
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        z0();
    }

    public final void z0() {
        if (this.D0 != null) {
            return;
        }
        View view = this.J;
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.D0 = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            this.F0 = textView;
            if (textView == null) {
                this.E0 = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.G0 = view.findViewById(16711682);
            this.H0 = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.D0 = listView;
            View view2 = this.E0;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.I0 = true;
        this.D0.setOnItemClickListener(this.C0);
        if (this.G0 != null) {
            z0();
            View view3 = this.G0;
            if (view3 == null) {
                throw new IllegalStateException("Can't be used with a custom content view");
            }
            if (this.I0) {
                this.I0 = false;
                view3.clearAnimation();
                this.H0.clearAnimation();
                this.G0.setVisibility(0);
                this.H0.setVisibility(8);
            }
        }
        this.A0.post(this.B0);
    }
}
