package com.tdw.swagger2.controller;

import com.tdw.swagger2.model.TbAccount;
import com.tdw.swagger2.service.TbAccountService;
import com.tdw.swagger2.suports.ErrorCode;
import com.tdw.swagger2.suports.ResultMessage;
import com.tdw.swagger2.utils.FieldValidator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * @author tangxs
 * @date 2017/11/16
 */
@Api(tags = "TbAccountControllerApi",description = "账户管理接口相关api描述",hidden = true,position = 1)
@RestController
public class TbAccountController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbAccountService tbAccountService;

    @ApiOperation(value = "根据ID查询账户基本信息")
    @ApiImplicitParam(paramType="path",name="accountId",dataType="String",required=true,value="账户编号")
    @GetMapping(value = "/api/account/{accountId}")
    public Object getAccount(@PathVariable(name = "accountId") String accountId){
        logger.info(">>账户查询接口:" +accountId);
        ResultMessage resultMessage = new ResultMessage(ErrorCode.ACCOUNT_SERVICE_OK);
        if (FieldValidator.isEmpty(accountId))
        {
            resultMessage.setResultMessage(ErrorCode.ACCOUNT_SERVICE_REQUIRED_FIELD_IS_NULL);
            return resultMessage;
        }
        TbAccount account = tbAccountService.findByAccountId(accountId);
        resultMessage.setData(account);
        return resultMessage;
    }

    @ApiOperation(value = "查询所有账户基本信息")
    @GetMapping(value = "/api/account")
    public Object getAllAccount(){
        logger.info(">>查询所有账户" );
        ResultMessage resultMessage = new ResultMessage(ErrorCode.ACCOUNT_SERVICE_OK);
        List<TbAccount> account = tbAccountService.findAll();
        if (account == null || account.isEmpty())
        {
            resultMessage.setCode(4001);
            resultMessage.setMessage("没有账户信息");
            return resultMessage;
        }
        resultMessage.setData(account);
        return resultMessage;
    }

    @ApiOperation("删除账户")
    @ApiImplicitParam(paramType="path",name="accountId",dataType="String",required=true,value="账户编号")
    @DeleteMapping(value = "/api/account/{accountId}")
    public Object delAccount(@PathVariable(name = "accountId") String accountId){
        logger.info(">>账户删除接口:" +accountId);
        ResultMessage resultMessage = new ResultMessage(ErrorCode.ACCOUNT_SERVICE_OK);
        if (FieldValidator.isEmpty(accountId))
        {
            resultMessage.setResultMessage(ErrorCode.ACCOUNT_SERVICE_REQUIRED_FIELD_IS_NULL);
            return resultMessage;
        }
        Integer row = tbAccountService.deleteAccount(accountId);
        resultMessage.setData(row);
        return resultMessage;
    }


    @ApiOperation("新增账户")
    @PostMapping(value = "/api/account")
    public Object addAccount(@RequestBody TbAccount account){
        ResultMessage resultMessage = new ResultMessage(ErrorCode.ACCOUNT_SERVICE_OK);
        Boolean flag;
        try {
            flag= FieldValidator.validaModelRequiredField(account);
        } catch (IllegalAccessException e) {
            resultMessage.setResultMessage(ErrorCode.ACCOUNT_SERVICE_ERROR);
            resultMessage.setData(e.getMessage());
            return resultMessage;
        }
        if (!flag)
        {
            resultMessage.setResultMessage(ErrorCode.ACCOUNT_SERVICE_REQUIRED_FIELD_IS_NULL);
            return resultMessage;
        }
        Integer row = tbAccountService.insertAccount(account);
        resultMessage.setData(row);
        return resultMessage;
    }

    @ApiOperation("更新账户")
    @PutMapping(value = "/api/account")
    public Object updateAccount(@RequestBody TbAccount account){
        ResultMessage resultMessage = new ResultMessage(ErrorCode.ACCOUNT_SERVICE_OK);
        Boolean flag;
        try {
            flag= FieldValidator.validaModelRequiredField(account);
        } catch (IllegalAccessException e) {
            resultMessage.setResultMessage(ErrorCode.ACCOUNT_SERVICE_ERROR);
            resultMessage.setData(e.getMessage());
            return resultMessage;
        }
        if (!flag)
        {
            resultMessage.setResultMessage(ErrorCode.ACCOUNT_SERVICE_REQUIRED_FIELD_IS_NULL);
            return resultMessage;
        }
        Integer row = tbAccountService.updateAccount(account);
        resultMessage.setData(row);
        return resultMessage;
    }

}
