package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class sn {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity2) {
        c41 b41Var;
        activity2.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                b41Var = new b41(clipData, 3);
            } else {
                d41 d41Var = new d41();
                d41Var.b = clipData;
                d41Var.c = 3;
                b41Var = d41Var;
            }
            q69.m(textView, b41Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity2) {
        c41 b41Var;
        activity2.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            b41Var = new b41(clipData, 3);
        } else {
            d41 d41Var = new d41();
            d41Var.b = clipData;
            d41Var.c = 3;
            b41Var = d41Var;
        }
        q69.m(view, b41Var.build());
        return true;
    }
}
