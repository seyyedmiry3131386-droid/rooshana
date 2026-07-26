package ir.mservices.market.social.requests.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestListResponseDto implements bf5, Serializable {

    @vo7("accounts")
    private final ArrayList<AccountDto> accounts;

    @vo7("eol")
    private final boolean eol;

    public RequestListResponseDto(ArrayList<AccountDto> arrayList, boolean z) {
        js3.p(arrayList, "accounts");
        this.accounts = arrayList;
        this.eol = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestListResponseDto copy$default(RequestListResponseDto requestListResponseDto, ArrayList arrayList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = requestListResponseDto.accounts;
        }
        if ((i & 2) != 0) {
            z = requestListResponseDto.eol;
        }
        return requestListResponseDto.copy(arrayList, z);
    }

    public final ArrayList<AccountDto> component1() {
        return this.accounts;
    }

    public final boolean component2() {
        return this.eol;
    }

    public final RequestListResponseDto copy(ArrayList<AccountDto> arrayList, boolean z) {
        js3.p(arrayList, "accounts");
        return new RequestListResponseDto(arrayList, z);
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestListResponseDto)) {
            return false;
        }
        RequestListResponseDto requestListResponseDto = (RequestListResponseDto) obj;
        return js3.i(this.accounts, requestListResponseDto.accounts) && this.eol == requestListResponseDto.eol;
    }

    public final ArrayList<AccountDto> getAccounts() {
        return this.accounts;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public int hashCode() {
        return (this.accounts.hashCode() * 31) + (this.eol ? 1231 : 1237);
    }

    public String toString() {
        return "RequestListResponseDto(accounts=" + this.accounts + ", eol=" + this.eol + ")";
    }
}
