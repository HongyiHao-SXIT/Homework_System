package com.ojprogram.ojprogram.common.api;

import java.io.Serializable;


public interface IResultCode extends Serializable {
    String getMessage();
    int getCode();
}
