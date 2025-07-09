# 🌟 CommandBlocker - Bloquea comandos y autocompletado con estilo

🎯 **CommandBlocker** es un plugin ligero, simple y potente diseñado para servidores **Folia**, **Paper** o **Spigot** que te permite **bloquear comandos** y su **autocompletado (TAB)** para evitar que jugadores descubran o usen comandos no deseados.

---

### 🚀 Características

✅ Bloquea cualquier comando que no esté en la lista permitida
✅ Bloquea el autocompletado de comandos (`TAB`)
✅ Sistema de permisos con bypass (`commandblocker.bypass`)
✅ Comando `/cb reload` para recargar la configuración
✅ Comando oculto `/cbtest` para testear el plugin
✅ Compatible con Minecraft 1.20+ y **Folia**
✅ Configuración personalizable: ¡Mensajes incluidos!

---

### 📂 Ejemplo de `config.yml`

```yaml
allowed-commands:
  - help
  - msg
  - spawn

messages:
  command-blocked: "&cEste comando está bloqueado."
  reload-success: "&aConfiguración recargada."
  no-permission: "&cNo tienes permiso para usar este comando."
  test-success: "&aEl plugin está funcionando correctamente."
```

---

### 🔐 Permisos

| Permiso                 | Descripción                                    |
| ----------------------- | ---------------------------------------------- |
| `commandblocker.bypass` | Permite usar y tab-completar cualquier comando |
| `commandblocker.admin`  | Permite usar `/cb reload`                      |
| `commandblocker.test`   | Permite usar `/cbtest`                         |

---

### 🧠 ¿Por qué usarlo?

🔒 Si quieres evitar que los jugadores:

* Usen comandos que no deberían
* Descubran plugins o comandos con `/(tab)`
* Intenten explotar comandos externos

🎯 Este plugin es **ideal para networks, servidores PvP, survival, lobbies y más**.

---

### 🧪 Comprobado con:

* ✅ Minecraft 1.20.1+
* ✅ Folia (soporte nativo)
* ✅ Paper y derivados
* ✅ Compatible con plugins como **LuckPerms**, **AuthMe**, **TAB**, etc.

---

### 📥 Instalación

1. Descarga el `.jar` y colócalo en `/plugins/`
2. Inicia el servidor
3. Ajusta `config.yml` a tu gusto
4. ¡Listo!

---

### 💬 ¿Soporte o sugerencias?

Puedes dejar un comentario o crear un issue en GitHub si tienes ideas, bugs o necesitas ayuda.
