# Egriot

## Getting Started
WIP

## Usage
### Define your GATT client as java interface
WIP

```java
@GattClient
public interface MyBleDevice {
    @ReadCharacteristic(
        serviceUuid = "0000180f-0000-1000-8000-00805f9b34fb",
        characteristicUuid = "00002a19-0000-1000-8000-00805f9b34fb"
    )
    Call<BluetoothGattCharacteristic> readBatteryLevel();

    @WriteCharacteristic(
        serviceUuid = "00001802-0000-1000-8000-00805f9b34fb",
        characteristicUuid = "00002a06-0000-1000-8000-00805f9b34fb"
    )
    Call<BluetoothGattCharacteristic> writeAlertLevel(byte[] value);
}
```

### Generate your gatt client instance
WIP

```java
MyBleDevice myBleDevice = Egriot.builder(MyBleDevice.class).build();
```


## License
```
Copyright 2016 izumin5210

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```