package androidx.compose.ui.autofill;

import defpackage.yj1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@yj1
public final class AutofillType {
    public static final /* synthetic */ AutofillType[] a;

    static {
        AutofillType[] autofillTypeArr = {new AutofillType("EmailAddress", 0), new AutofillType("Username", 1), new AutofillType("Password", 2), new AutofillType("NewUsername", 3), new AutofillType("NewPassword", 4), new AutofillType("PostalAddress", 5), new AutofillType("PostalCode", 6), new AutofillType("CreditCardNumber", 7), new AutofillType("CreditCardSecurityCode", 8), new AutofillType("CreditCardExpirationDate", 9), new AutofillType("CreditCardExpirationMonth", 10), new AutofillType("CreditCardExpirationYear", 11), new AutofillType("CreditCardExpirationDay", 12), new AutofillType("AddressCountry", 13), new AutofillType("AddressRegion", 14), new AutofillType("AddressLocality", 15), new AutofillType("AddressStreet", 16), new AutofillType("AddressAuxiliaryDetails", 17), new AutofillType("PostalCodeExtended", 18), new AutofillType("PersonFullName", 19), new AutofillType("PersonFirstName", 20), new AutofillType("PersonLastName", 21), new AutofillType("PersonMiddleName", 22), new AutofillType("PersonMiddleInitial", 23), new AutofillType("PersonNamePrefix", 24), new AutofillType("PersonNameSuffix", 25), new AutofillType("PhoneNumber", 26), new AutofillType("PhoneNumberDevice", 27), new AutofillType("PhoneCountryCode", 28), new AutofillType("PhoneNumberNational", 29), new AutofillType("Gender", 30), new AutofillType("BirthDateFull", 31), new AutofillType("BirthDateDay", 32), new AutofillType("BirthDateMonth", 33), new AutofillType("BirthDateYear", 34), new AutofillType("SmsOtpCode", 35)};
        a = autofillTypeArr;
        kotlin.enums.a.a(autofillTypeArr);
    }

    public static AutofillType valueOf(String str) {
        return (AutofillType) Enum.valueOf(AutofillType.class, str);
    }

    public static AutofillType[] values() {
        return (AutofillType[]) a.clone();
    }
}
