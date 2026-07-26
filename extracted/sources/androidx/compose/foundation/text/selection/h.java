package androidx.compose.foundation.text.selection;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.f;
import defpackage.at2;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.e71;
import defpackage.ig8;
import defpackage.lg8;
import defpackage.mb5;
import defpackage.s08;
import defpackage.tx8;
import defpackage.xf8;
import defpackage.zi8;
import defpackage.zu7;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements dp2 {
    public final /* synthetic */ f a;
    public final /* synthetic */ e71 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ h(f fVar, e71 e71Var, Context context) {
        this.a = fVar;
        this.b = e71Var;
        this.c = context;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        xf8 xf8Var = (xf8) obj;
        mb5 mb5Var = xf8Var.a;
        mb5 mb5Var2 = xf8Var.a;
        lg8 lg8Var = lg8.b;
        mb5Var.g(lg8Var);
        TextContextMenuItems textContextMenuItems = TextContextMenuItems.d;
        final f fVar = this.a;
        final int i = 0;
        final int i2 = 1;
        boolean z = (zi8.d(fVar.q().b) || !fVar.m() || fVar.g == null) ? false : true;
        final TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1 = new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1(fVar, null);
        final e71 e71Var = this.b;
        bp2 bp2Var = new bp2(textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1) { // from class: androidx.compose.foundation.text.selection.g
            public final /* synthetic */ SuspendLambda b;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.b = (SuspendLambda) textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // defpackage.bp2
            public final Object invoke() {
                bt2.G(this.a, null, CoroutineStart.d, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(null, this.b), 1);
                return tx8.a;
            }
        };
        Context context = this.c;
        Resources resources = context.getResources();
        zu7 zu7Var = new zu7(bp2Var, null, 1);
        if (z) {
            mb5Var2.g(new ig8(at2.u, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, zu7Var));
        }
        TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.d;
        boolean z2 = (zi8.d(fVar.q().b) || fVar.g == null) ? false : true;
        final TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 = new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(fVar, null);
        bp2 bp2Var2 = new bp2(textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2) { // from class: androidx.compose.foundation.text.selection.g
            public final /* synthetic */ SuspendLambda b;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.b = (SuspendLambda) textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // defpackage.bp2
            public final Object invoke() {
                bt2.G(this.a, null, CoroutineStart.d, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(null, this.b), 1);
                return tx8.a;
            }
        };
        Resources resources2 = context.getResources();
        zu7 zu7Var2 = new zu7(bp2Var2, null, 1);
        if (z2) {
            mb5Var2.g(new ig8(at2.v, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, zu7Var2));
        }
        TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.d;
        boolean z3 = fVar.m() && ((Boolean) ((s08) fVar.w).getValue()).booleanValue() && fVar.g != null;
        final TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3 = new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3(fVar, null);
        bp2 bp2Var3 = new bp2(textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3) { // from class: androidx.compose.foundation.text.selection.g
            public final /* synthetic */ SuspendLambda b;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.b = (SuspendLambda) textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [dp2, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // defpackage.bp2
            public final Object invoke() {
                bt2.G(this.a, null, CoroutineStart.d, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(null, this.b), 1);
                return tx8.a;
            }
        };
        Resources resources3 = context.getResources();
        zu7 zu7Var3 = new zu7(bp2Var3, null, 1);
        if (z3) {
            mb5Var2.g(new ig8(at2.w, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, zu7Var3));
        }
        TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.d;
        boolean z4 = zi8.e(fVar.q().b) != fVar.q().a.b.length();
        bp2 bp2Var4 = new bp2() { // from class: wh8
            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i) {
                    case 0:
                        break;
                    case 1:
                        f fVar2 = fVar;
                        zh8 zh8VarG = f.g(fVar2.q().a, uy6.b(0, fVar2.q().a.b.length()));
                        fVar2.c.invoke(zh8VarG);
                        long j = zh8VarG.b;
                        fVar2.v = new zi8(j);
                        fVar2.t = zh8.a(fVar2.t, null, j, 5);
                        fVar2.j(true);
                        break;
                    default:
                        bp2 bp2Var5 = fVar.f;
                        if (bp2Var5 != null) {
                            bp2Var5.invoke();
                        }
                        break;
                }
                return tx8.a;
            }
        };
        bp2 bp2Var5 = new bp2() { // from class: wh8
            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        break;
                    case 1:
                        f fVar2 = fVar;
                        zh8 zh8VarG = f.g(fVar2.q().a, uy6.b(0, fVar2.q().a.b.length()));
                        fVar2.c.invoke(zh8VarG);
                        long j = zh8VarG.b;
                        fVar2.v = new zi8(j);
                        fVar2.t = zh8.a(fVar2.t, null, j, 5);
                        fVar2.j(true);
                        break;
                    default:
                        bp2 bp2Var52 = fVar.f;
                        if (bp2Var52 != null) {
                            bp2Var52.invoke();
                        }
                        break;
                }
                return tx8.a;
            }
        };
        Resources resources4 = context.getResources();
        zu7 zu7Var4 = new zu7(bp2Var5, bp2Var4, 1);
        if (z4) {
            mb5Var2.g(new ig8(at2.x, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, zu7Var4));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.d;
            if (fVar.m() && zi8.d(fVar.q().b)) {
                i = 1;
            }
            final int i3 = 2;
            bp2 bp2Var6 = new bp2() { // from class: wh8
                @Override // defpackage.bp2
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            break;
                        case 1:
                            f fVar2 = fVar;
                            zh8 zh8VarG = f.g(fVar2.q().a, uy6.b(0, fVar2.q().a.b.length()));
                            fVar2.c.invoke(zh8VarG);
                            long j = zh8VarG.b;
                            fVar2.v = new zi8(j);
                            fVar2.t = zh8.a(fVar2.t, null, j, 5);
                            fVar2.j(true);
                            break;
                        default:
                            bp2 bp2Var52 = fVar.f;
                            if (bp2Var52 != null) {
                                bp2Var52.invoke();
                            }
                            break;
                    }
                    return tx8.a;
                }
            };
            Resources resources5 = context.getResources();
            zu7 zu7Var5 = new zu7(bp2Var6, null, 1);
            if (i != 0) {
                mb5Var2.g(new ig8(textContextMenuItems5.a, resources5.getString(textContextMenuItems5.b), textContextMenuItems5.c, zu7Var5));
            }
        }
        mb5Var2.g(lg8Var);
        return tx8.a;
    }
}
