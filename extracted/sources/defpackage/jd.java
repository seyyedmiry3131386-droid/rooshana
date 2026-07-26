package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class jd {
    public final int A;
    public final int B;
    public final boolean C;
    public final hd D;
    public final Context a;
    public final ld b;
    public final Window c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f;
    public Button h;
    public CharSequence i;
    public Message j;
    public Button k;
    public CharSequence l;
    public Message m;
    public Button n;
    public CharSequence o;
    public Message p;
    public NestedScrollView q;
    public Drawable r;
    public ImageView s;
    public TextView t;
    public TextView u;
    public View v;
    public ListAdapter w;
    public final int y;
    public final int z;
    public boolean g = false;
    public int x = -1;
    public final r5 E = new r5(1, this);

    public jd(Context context, ld ldVar, Window window) {
        this.a = context;
        this.b = ldVar;
        this.c = window;
        hd hdVar = new hd(0);
        hdVar.b = new WeakReference(ldVar);
        this.D = hdVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, lu6.AlertDialog, xp6.alertDialogStyle, 0);
        this.y = typedArrayObtainStyledAttributes.getResourceId(lu6.AlertDialog_android_layout, 0);
        typedArrayObtainStyledAttributes.getResourceId(lu6.AlertDialog_buttonPanelSideLayout, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(lu6.AlertDialog_listLayout, 0);
        typedArrayObtainStyledAttributes.getResourceId(lu6.AlertDialog_multiChoiceItemLayout, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(lu6.AlertDialog_singleChoiceItemLayout, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(lu6.AlertDialog_listItemLayout, 0);
        this.C = typedArrayObtainStyledAttributes.getBoolean(lu6.AlertDialog_showTitle, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(lu6.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        ldVar.e().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.D.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.o = charSequence;
            this.p = messageObtainMessage;
        } else if (i == -2) {
            this.l = charSequence;
            this.m = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.i = charSequence;
            this.j = messageObtainMessage;
        }
    }
}
