// IPersonManager.aidl
package lxy.android.com.binderdemo.demo2;

import lxy.android.com.binderdemo.demo2.bean.Person;


interface IPersonManager {
/**
* 除了基本数据类型，其他类型的参数都需要标上方向类型：in(输入)，out(输出)，inout(输入输出)
*/
  void addPerson(in Person person);
  List<Person> getPersonList();

}
