package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import defpackage.ap8;
import defpackage.bt6;
import defpackage.ep8;
import defpackage.hs6;
import defpackage.ip8;
import defpackage.pj9;
import defpackage.qp8;
import defpackage.r5;
import defpackage.yo8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public final int a;
    public final LayoutInflater b;
    public final CheckedTextView c;
    public final CheckedTextView d;
    public final r5 e;
    public final ArrayList f;
    public final HashMap g;
    public boolean h;
    public boolean i;
    public ap8 j;
    public CheckedTextView[][] k;
    public boolean l;

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public final void a() {
        this.c.setChecked(this.l);
        boolean z = this.l;
        HashMap map = this.g;
        this.d.setChecked(!z && map.isEmpty());
        for (int i = 0; i < this.k.length; i++) {
            ep8 ep8Var = (ep8) map.get(((qp8) this.f.get(i)).b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.k[i];
                if (i2 < checkedTextViewArr.length) {
                    if (ep8Var != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.k[i][i2].setChecked(ep8Var.b.contains(Integer.valueOf(((ip8) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.d;
        CheckedTextView checkedTextView2 = this.c;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.k = new CheckedTextView[arrayList.size()][];
        boolean z = this.i && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            qp8 qp8Var = (qp8) arrayList.get(i);
            boolean z2 = this.h && qp8Var.c;
            CheckedTextView[][] checkedTextViewArr = this.k;
            int i2 = qp8Var.a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            ip8[] ip8VarArr = new ip8[i2];
            for (int i3 = 0; i3 < qp8Var.a; i3++) {
                ip8VarArr[i3] = new ip8(qp8Var, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.b;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(hs6.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.a);
                ap8 ap8Var = this.j;
                ip8 ip8Var = ip8VarArr[i4];
                checkedTextView3.setText(((pj9) ap8Var).t(ip8Var.a.a(ip8Var.b)));
                checkedTextView3.setTag(ip8VarArr[i4]);
                if (qp8Var.b(i4)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.k[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.l;
    }

    public Map<yo8, ep8> getOverrides() {
        return this.g;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.h != z) {
            this.h = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (!z) {
                HashMap map = this.g;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.f;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        ep8 ep8Var = (ep8) map.get(((qp8) arrayList.get(i)).b);
                        if (ep8Var != null && map2.isEmpty()) {
                            map2.put(ep8Var.a, ep8Var);
                        }
                        i++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(ap8 ap8Var) {
        ap8Var.getClass();
        this.j = ap8Var;
        b();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.b = layoutInflaterFrom;
        r5 r5Var = new r5(10, this);
        this.e = r5Var;
        this.j = new pj9(getResources());
        this.f = new ArrayList();
        this.g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(bt6.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(r5Var);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(hs6.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(bt6.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(r5Var);
        addView(checkedTextView2);
    }
}
