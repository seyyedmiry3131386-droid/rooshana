package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class o02 extends is3 {
    public final TextView u;
    public final h02 v;
    public boolean w = true;

    public o02(TextView textView) {
        this.u = textView;
        this.v = new h02(textView);
    }

    @Override // defpackage.is3
    public final void J(boolean z) {
        if (z) {
            TextView textView = this.u;
            textView.setTransformationMethod(Q(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.is3
    public final void K(boolean z) {
        this.w = z;
        TextView textView = this.u;
        textView.setTransformationMethod(Q(textView.getTransformationMethod()));
        textView.setFilters(p(textView.getFilters()));
    }

    @Override // defpackage.is3
    public final TransformationMethod Q(TransformationMethod transformationMethod) {
        return this.w ? ((transformationMethod instanceof s02) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new s02(transformationMethod) : transformationMethod instanceof s02 ? ((s02) transformationMethod).a : transformationMethod;
    }

    @Override // defpackage.is3
    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        if (!this.w) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof h02) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            h02 h02Var = this.v;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = h02Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == h02Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.is3
    public final boolean x() {
        return this.w;
    }
}
