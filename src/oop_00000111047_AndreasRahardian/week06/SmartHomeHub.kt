package oop_00000111047_AndreasRahardian.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }

    println("\n=== SMART HOME INSTANTIATION ===")
    val lamp = SmartLamp("L1", "Ruang Tamu")
    val speaker = SmartSpeaker("S1", "Google Nest Dapur")
    val cctv = SmartCCTV("C1", "Ezviz Garasi")
}